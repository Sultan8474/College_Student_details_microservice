package com.api.main.custom_exception;

@SuppressWarnings("serial")
public class ResourceNotFountException  extends RuntimeException
{
	public ResourceNotFountException(String msg)
	{
	      super(msg);
	}

}
