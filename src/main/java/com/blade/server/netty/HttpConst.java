package com.blade.server.netty;

import io.netty.util.AsciiString;

/**
 * Http headers const
 *
 * @author biezhi
 * @date 2017/10/16
 */
public interface HttpConst {
    String IF_MODIFIED_SINCE   = "IF_MODIFIED_SINCE";
    String USER_AGENT          = "User-Agent";
    String CONTENT_TYPE_STRING = "Content-Type";
    String COOKIE_STRING       = "Cookie";
    String METHOD_GET          = "GET";
    String IE_UA               = "MSIE";
    String DEFAULT_SESSION_KEY = "SESSION";
    String SLASH               = "/";
    char   CHAR_SLASH          = '/';
    char   CHAR_POINT          = '.';

    AsciiString CONNECTION     = AsciiString.cached("Connection");
    AsciiString CONTENT_LENGTH = AsciiString.cached("Content-Length");
    AsciiString CONTENT_TYPE   = AsciiString.cached("Content-Type");
    AsciiString DATE           = AsciiString.cached("Date");
    AsciiString LOCATION       = AsciiString.cached("Location");
    AsciiString X_POWER_BY     = AsciiString.cached("X-Powered-By");
    AsciiString EXPIRES        = AsciiString.cached("Expires");
    AsciiString CACHE_CONTROL  = AsciiString.cached("Cache-Control");
    AsciiString LAST_MODIFIED  = AsciiString.cached("Last-Modified");
    AsciiString SERVER         = AsciiString.cached("Server");
    AsciiString SET_COOKIE     = AsciiString.cached("Set-Cookie");
    AsciiString KEEP_ALIVE     = AsciiString.cached("Keep-Alive");
}
