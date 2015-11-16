// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.apache.http.client.HttpResponseException;

public final class czr
{

    public static czr a;
    private static String b = "none";

    public czr()
    {
    }

    private static HttpRequestInitializer a(int i, cbr cbr1, int j)
    {
        Object obj = dbf.e(i);
        String s = ((ani) (obj)).ae();
        String s1 = cbr1.a(((ani) (obj)).a());
        obj = null;
        if (s1 != null)
        {
            obj = cbr1.c(s1);
        }
        cbr1 = new hlm();
        cbr1.c(s1);
        return new czs(((Long) (obj)), s1, cbr1, s, j);
    }

    private static cvn a(byte abyte0[], ctr ctr, Method method)
    {
        Class class1 = ctr.getClass();
        if (method != null)
        {
            try
            {
                method = (cvn)method.invoke(null, new Object[] {
                    abyte0
                });
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                ctr = String.valueOf(class1);
                ebw.e("Babel_RequestWriter", (new StringBuilder(String.valueOf(ctr).length() + 35)).append("parseFrom method needs to be public").append(ctr).toString(), abyte0);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Method method)
            {
                ebw.g("Babel_RequestWriter", "Protocol buffer parsing failure");
                ctr = String.valueOf(ctr);
                ebw.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(ctr).length() + 9)).append("Request: ").append(ctr).toString());
                abyte0 = String.valueOf(g.a(abyte0));
                if (abyte0.length() != 0)
                {
                    abyte0 = "Response: ".concat(abyte0);
                } else
                {
                    abyte0 = new String("Response: ");
                }
                ebw.g("Babel_RequestWriter", abyte0);
                if (g.a(g.nS, "babel_debug_protobuf_parse_failure", false))
                {
                    gbh.a("Protocol buffer parsing failure");
                }
                abyte0 = String.valueOf(class1);
                ebw.e("Babel_RequestWriter", (new StringBuilder(String.valueOf(abyte0).length() + 28)).append("Could not invoke parseFrom: ").append(abyte0).toString(), method);
                return null;
            }
            return method;
        } else
        {
            abyte0 = String.valueOf(class1);
            ebw.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(abyte0).length() + 44)).append("Received unknown response type for request: ").append(abyte0).toString());
            return null;
        }
    }

    public static czr a()
    {
        if (a == null)
        {
            a = new czr();
            b = c();
        }
        return a;
    }

    public static void a(cbr cbr1, int i)
    {
        cbr1.d(dbf.e(i).a());
    }

    private static byte[] a(int i, cbr cbr1, boolean flag, GenericUrl genericurl, HttpContent httpcontent, int j, int k)
    {
        android.content.Context context = g.nS;
        gbg gbg1 = (gbg)hgx.b(context, gbg);
        if (gbg1 == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        gz gz1 = new gz();
        gz1.put("Accept-Encoding", "gzip");
        Object obj = dbf.e(i);
        String s = ((ani) (obj)).a();
        if (((ani) (obj)).F())
        {
            gz1.put("X-Goog-PageId", ((ani) (obj)).ae());
        }
        String s1 = cbr1.a(s);
        obj = String.valueOf(s1);
        if (((String) (obj)).length() != 0)
        {
            obj = "Bearer ".concat(((String) (obj)));
        } else
        {
            obj = new String("Bearer ");
        }
        gz1.put("Authorization", obj);
        s = "none";
        obj = s;
        if (s1 != null)
        {
            cbr1 = cbr1.c(s1);
            obj = s;
            if (cbr1 != null)
            {
                obj = cbr1.toString();
            }
        }
        gz1.put("X-Auth-Time", obj);
        gz1.put("X-Device-ID", b);
        gz1.put("X-Network-ID", dzk.b());
        gz1.put("User-Agent", g.i());
        if (flag)
        {
            cbr1 = kop.toByteArray(((csj)httpcontent).a);
        } else
        {
            cbr1 = null;
        }
        if (!dbq.a(i))
        {
            i = 3;
        } else
        {
            i = k;
        }
        try
        {
            cbr1 = gbg1.a(context, genericurl.toString(), gz1, cbr1, j, i);
        }
        // Misplaced declaration of an exception variable
        catch (cbr cbr1)
        {
            throw dbo.a(cbr1.getStatusCode(), cbr1, null);
        }
        return cbr1;
        cbr1 = (new hmf()).createRequestFactory(a(i, cbr1, j));
        if (flag)
        {
            cbr1 = cbr1.buildPostRequest(genericurl, httpcontent);
        } else
        {
            cbr1 = cbr1.buildGetRequest(genericurl);
        }
        cbr1 = cbr1.execute();
        if (!cbr1.isSuccessStatusCode())
        {
            throw dbo.a(cbr1.getStatusCode(), null, null);
        } else
        {
            return a(((HttpResponse) (cbr1)));
        }
    }

    private static byte[] a(HttpResponse httpresponse)
    {
        HttpResponse httpresponse1 = null;
        httpresponse = httpresponse.getContent();
        httpresponse1 = httpresponse;
        BufferedInputStream bufferedinputstream = new BufferedInputStream(httpresponse);
        httpresponse1 = httpresponse;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        httpresponse1 = httpresponse;
        int i = bufferedinputstream.read();
_L2:
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        httpresponse1 = httpresponse;
        bytearrayoutputstream.write((byte)i);
        httpresponse1 = httpresponse;
        i = bufferedinputstream.read();
        if (true) goto _L2; else goto _L1
        IOException ioexception1;
        ioexception1;
        httpresponse1 = httpresponse;
        ebw.d("Babel_RequestWriter", "Error reading response stream", ioexception1);
        httpresponse1 = httpresponse;
        throw new dbo(106, ioexception1);
        httpresponse;
        byte abyte0[];
        if (httpresponse1 != null)
        {
            try
            {
                httpresponse1.close();
            }
            catch (IOException ioexception) { }
        }
        throw httpresponse;
_L1:
        httpresponse1 = httpresponse;
        abyte0 = bytearrayoutputstream.toByteArray();
        if (httpresponse != null)
        {
            try
            {
                httpresponse.close();
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                return abyte0;
            }
        }
        return abyte0;
    }

    static String b()
    {
        return b;
    }

    private static String c()
    {
        Object obj;
        try
        {
            long l = dzk.a();
            obj = MessageDigest.getInstance("md5");
            byte abyte0[] = new byte[8];
            ByteBuffer.wrap(abyte0).asLongBuffer().put(0, l);
            obj = g.a(((MessageDigest) (obj)).digest(abyte0));
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return "none";
        }
        return ((String) (obj));
    }

    public cvn a(GenericUrl genericurl, cui cui1, int i, cbr cbr1, boolean flag, int j)
    {
        if (i == -1)
        {
            return null;
        }
        int k = cui1.q();
        com.google.api.client.http.AbstractInputStreamContent abstractinputstreamcontent;
        ani ani1;
        HttpContent httpcontent;
        boolean flag1;
        if (k != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        abstractinputstreamcontent = null;
        ani1 = dbf.e(i);
        httpcontent = cui1.b(dbf.f(ani1), j, ani1.h());
        if (httpcontent != null)
        {
            int l = g.a(g.nS, "babel_server_request_timeout", 40000);
            if (flag1)
            {
                abstractinputstreamcontent = cui1.p();
                if (abstractinputstreamcontent == null)
                {
                    throw new dbo(122);
                }
                if (k == 1)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                cbr1 = new hly(abstractinputstreamcontent, new hmf(), a(i, cbr1, l));
                if (j != 0)
                {
                    cbr1.b();
                }
                cbr1.a(httpcontent);
                abstractinputstreamcontent = a(cbr1.a(genericurl));
                if (k == 1)
                {
                    i = 2132;
                } else
                {
                    i = 2133;
                }
                g.a(ani1, i);
            } else
            {
                abstractinputstreamcontent = a(i, cbr1, flag, genericurl, httpcontent, l, cui1.o());
            }
        }
        genericurl = (dke)RequestWriter.a.get(cui1.getClass());
        if (genericurl != null)
        {
            genericurl = ((dke) (genericurl)).b;
        } else
        {
            genericurl = null;
        }
        return a(((byte []) (abstractinputstreamcontent)), ((ctr) (cui1)), ((Method) (genericurl)));
    }

}
