package online.springboot.demo.api.entity;

import java.net.URI;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

public class HttpRequest implements HttpUriRequest{

	public RequestLine getRequestLine() {
		// TODO Auto-generated method stub
		return null;
	}

	public ProtocolVersion getProtocolVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsHeader(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public Header[] getHeaders(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Header getFirstHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Header getLastHeader(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Header[] getAllHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addHeader(Header header) {
		// TODO Auto-generated method stub
		
	}

	public void addHeader(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	public void setHeader(Header header) {
		// TODO Auto-generated method stub
		
	}

	public void setHeader(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	public void setHeaders(Header[] headers) {
		// TODO Auto-generated method stub
		
	}

	public void removeHeader(Header header) {
		// TODO Auto-generated method stub
		
	}

	public void removeHeaders(String name) {
		// TODO Auto-generated method stub
		
	}

	public HeaderIterator headerIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public HeaderIterator headerIterator(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public HttpParams getParams() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setParams(HttpParams params) {
		// TODO Auto-generated method stub
		
	}

	public String getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	public URI getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	public void abort() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	public boolean isAborted() {
		// TODO Auto-generated method stub
		return false;
	}

}
