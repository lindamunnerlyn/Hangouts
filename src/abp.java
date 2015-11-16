// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class abp extends abo
{

    private byte c[];

    public abp(ContentResolver contentresolver, Uri uri)
    {
        super(contentresolver, uri);
    }

    private static byte[] a(Uri uri)
    {
        uri = uri.getSchemeSpecificPart();
        if (uri.startsWith("base64,"))
        {
            return Base64.decode(uri.substring(7), 8);
        }
        if (!abn.a().matcher(uri).matches())
        {
            break MISSING_BLOCK_LABEL_100;
        }
        uri = Base64.decode(uri.substring(uri.indexOf("base64,") + 7), 0);
        return uri;
        uri;
        uri = String.valueOf(uri);
        Log.e("ImageUtils", (new StringBuilder(String.valueOf(uri).length() + 21)).append("Mailformed data URI: ").append(uri).toString());
        return null;
    }

    public InputStream a()
    {
        if (c == null)
        {
            c = a(b);
            if (c == null)
            {
                return super.a();
            }
        }
        return new ByteArrayInputStream(c);
    }
}
