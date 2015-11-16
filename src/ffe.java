// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.HttpURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

final class ffe extends BasicHttpResponse
{

    private static final StatusLine b;
    HttpURLConnection a;

    ffe()
    {
        super(b, null, null);
    }

    static 
    {
        b = new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "Unknown error");
    }
}
