package com.api.main.exception;

@SuppressWarnings("serial")
public class ResourceNotFountException extends RuntimeException 
{
	public ResourceNotFountException(String msg)
	{
		super(msg);
	}

}
