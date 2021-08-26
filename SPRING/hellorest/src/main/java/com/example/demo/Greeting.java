/* 
    Greeting

    Copyright (C) 2021 Luciano A.

    Greeting is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Greeting program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Greeting.  If not, see <https://www.gnu.org/licenses/>.

*/
package com.example.demo;

public class Greeting {
	private final long id;
	private final String content;
	public Greeting(long id, String content) {
		this.id=id;
		this.content=content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
}
