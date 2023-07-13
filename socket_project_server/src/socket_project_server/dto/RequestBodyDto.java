package socket_project_server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestBodyDto<T> {
	private String resource;      
	private T body;
	
}