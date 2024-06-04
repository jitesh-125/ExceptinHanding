package com.codedecode.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info= @Info(
				title ="ProductSwagger_Crud",
				description = "ExceptionHandingRestApi Crud Operation",
				summary = "This Is ExceptionHandingRestApi   will add,delete,update,fetch",
				termsOfService = "T&C",
				contact = @Contact(
						name="emp-rank",
						email = "help.customerSwagger@gmail.com"
						),
				license = @License(
						name="Your Licence No"
						),
				version = "vi"
				
				),
		servers = {
				@Server(
						description = "Dev",
						url = "http://localhost:9091"
						),
				@Server(
						description = "Prod",
						url = "http://localhost:9092"
						),
				@Server(
						description = "UAT",
						url = "http://localhost:9093"
						)
		}
				
)

public class OpenAppConfig {

}
