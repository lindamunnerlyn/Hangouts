// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Base64;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpTransport;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

class gjh
    implements giv
{

    public final long a;
    public final String b;
    public final byte c[];
    public final int d;
    public final String e;
    public final String f;
    public final gix g;
    public final String h;
    private final HttpTransport i;

    gjh(long l, String s, byte abyte0[], int j, String s1, long l1, HttpTransport httptransport, String s2, gix gix1)
    {
        a = l;
        b = s;
        c = abyte0;
        d = j;
        e = s1;
        i = httptransport;
        f = s2;
        g = gix1;
        if (l1 == 0L)
        {
            s = "none";
        } else
        {
            s = Long.toString(l1);
        }
        h = s;
    }

    private static byte[] a(giw giw1)
    {
        Object obj = null;
        InputStream inputstream = giw1.a();
        byte abyte0[] = inputstream;
        BufferedInputStream bufferedinputstream = new BufferedInputStream(inputstream);
        abyte0 = inputstream;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = inputstream;
        int j = bufferedinputstream.read();
_L2:
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0 = inputstream;
        bytearrayoutputstream.write((byte)j);
        abyte0 = inputstream;
        j = bufferedinputstream.read();
        if (true) goto _L2; else goto _L1
_L1:
        abyte0 = inputstream;
        if (!TextUtils.equals(giw1.a("X-Goog-Safety-Encoding"), "base64"))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        abyte0 = inputstream;
        giw1 = Base64.decode(bytearrayoutputstream.toByteArray(), 0);
        abyte0 = giw1;
        giw1 = abyte0;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (giw giw1)
            {
                return abyte0;
            }
            giw1 = abyte0;
        }
        return giw1;
        abyte0 = inputstream;
        giw1 = bytearrayoutputstream.toByteArray();
        abyte0 = giw1;
        giw1 = abyte0;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (giw giw1)
            {
                return abyte0;
            }
            return abyte0;
        } else
        {
            break MISSING_BLOCK_LABEL_109;
        }
        giw1;
        inputstream = null;
_L6:
        abyte0 = inputstream;
        gne.a(5, "vclib", "Error processing apiary response", giw1);
        giw1 = obj;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (giw giw1)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_109;
        }
        giw1;
        abyte0 = null;
_L4:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            catch (IOException ioexception) { }
        }
        throw giw1;
        giw1;
        if (true) goto _L4; else goto _L3
_L3:
        giw1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a()
    {
        g.a(a, b);
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
label0:
        {
            if (g != null)
            {
                if (abyte0 != null)
                {
                    break label0;
                }
                g.a(a);
            }
            return;
        }
        g.a(a, abyte0);
    }

    public Object b()
    {
        return c();
    }

    public byte[] c()
    {
        (new hqh()).c(e);
        Object obj = gir.a(e, h, d);
        obj = i.createRequestFactory(((com.google.api.client.http.HttpRequestInitializer) (obj)));
        giu giu1 = new giu(c);
        byte abyte0[];
        Object obj1;
        try
        {
            obj1 = new URL(new URL(f), b);
        }
        catch (MalformedURLException malformedurlexception)
        {
            gne.a(5, "vclib", "Error processing request url", malformedurlexception);
            return null;
        }
        obj1 = new GenericUrl(((URL) (obj1)));
        try
        {
            abyte0 = a(new giw(((HttpRequestFactory) (obj)).buildPostRequest(((GenericUrl) (obj1)), giu1).execute()));
        }
        catch (IOException ioexception)
        {
            gne.a(5, "vclib", "Error making apiary request", ioexception);
            return null;
        }
        return abyte0;
    }
}
