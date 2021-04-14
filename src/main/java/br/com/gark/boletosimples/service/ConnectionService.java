package br.com.gark.boletosimples.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Objects;

import org.springframework.http.HttpMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.gark.boletosimples.domain.enumeration.MethodEnum;
import br.com.gark.boletosimples.domain.enumeration.UrlEnum;
import br.com.gark.boletosimples.utils.DateTimeSerializer;

public class ConnectionService {

	private static final String TOKEN = "qjKt31ya34seFxVXqcnK67MqfuuyL2ULP6zRb588GRQ";

	private HttpURLConnection createConnection(final MethodEnum method, final HttpMethod httpMethod)
			throws KeyManagementException, NoSuchAlgorithmException, MalformedURLException, IOException {
		HttpURLConnection conn = (HttpURLConnection) new URL(UrlEnum.URL_TESTE.getUrl() + method.getMethod())
				.openConnection();

		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setUseCaches(true);
		conn.setAllowUserInteraction(false);
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("User-Agent", "gabrielrosakurth@gmail.com");
		conn.setRequestProperty("Authorization", "Bearer " + TOKEN);
		conn.setRequestMethod(httpMethod.toString());

		return conn;
	}

	private void buildJson(HttpURLConnection connection, Object object) throws IOException {
		if (Objects.nonNull(object)) {
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter bos = new OutputStreamWriter(os, "UTF-8");

			GsonBuilder builder = new GsonBuilder();
			builder.registerTypeAdapter(Date.class, new DateTimeSerializer());

			Gson gson = builder.create();
			String json = gson.toJson(object);

			bos.write(json);
			bos.close();
			os.close();
		}
	}

	public void sendRequest(final MethodEnum methodEnum, final HttpMethod httpMethod, Object object)
			throws UnsupportedEncodingException, IOException, InterruptedException, KeyManagementException,
			NoSuchAlgorithmException {
		HttpURLConnection connection = createConnection(methodEnum, httpMethod);

		if (Objects.nonNull(object)) {
			buildJson(connection, object);
		}

		connection.connect();

		BufferedReader reader = new BufferedReader(new InputStreamReader((connection.getInputStream()), "UTF-8"));
		StringBuffer resultado = new StringBuffer();
		String output;
		while (Objects.nonNull((output = reader.readLine()))) {
			resultado.append(output);
		}

		connection.disconnect();

		// Existe uma validação de uma requisição por segundo.
		Thread.sleep(1000);

		System.out.println(resultado.toString());
	}

}
