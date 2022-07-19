package com.academia.javaspring.academiajavaspring.infra.jackson;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.academia.javaspring.academiajavaspring.infra.jackson.deser.LocalDateDeser;
import com.academia.javaspring.academiajavaspring.infra.jackson.deser.LocalDateTimeDeser;
import com.academia.javaspring.academiajavaspring.infra.jackson.ser.LocalDateSer;
import com.academia.javaspring.academiajavaspring.infra.jackson.ser.LocalDateTimeSer;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {
	
	@Override
	public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
		jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
				.serializerByType(LocalDate.class, new LocalDateSer())
				.serializerByType(LocalDateTime.class, new LocalDateTimeSer())
				.deserializerByType(LocalDate.class, new LocalDateDeser())
				.deserializerByType(LocalDateTime.class, new LocalDateTimeDeser());
	}
}