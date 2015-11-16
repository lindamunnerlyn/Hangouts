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

public final class dax
{

    public static dax a;
    static String b = "none";

    public dax()
    {
    }

    private static HttpRequestInitializer a(int i, ccw ccw1, int j)
    {
        Long long1 = null;
        Object obj = dcn.e(i);
        String s = ((aoa) (obj)).ab();
        obj = ((aoa) (obj)).a();
        if (ccw1 == null)
        {
            obj = null;
        } else
        {
            obj = ccw1.a(((String) (obj)));
        }
        if (obj != null)
        {
            long1 = ccw1.c(((String) (obj)));
        }
        ccw1 = new hqh();
        ccw1.c(((String) (obj)));
        return new day(long1, ((String) (obj)), ccw1, s, j);
    }

    private static cxr a(byte abyte0[], cvv cvv, Method method)
    {
        Class class1 = cvv.getClass();
        if (method != null)
        {
            try
            {
                method = (cxr)method.invoke(null, new Object[] {
                    abyte0
                });
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                cvv = String.valueOf(class1);
                eev.e("Babel_RequestWriter", (new StringBuilder(String.valueOf(cvv).length() + 35)).append("parseFrom method needs to be public").append(cvv).toString(), abyte0);
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Method method)
            {
                eev.g("Babel_RequestWriter", "Protocol buffer parsing failure");
                cvv = String.valueOf(cvv);
                eev.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(cvv).length() + 9)).append("Request: ").append(cvv).toString());
                abyte0 = String.valueOf(g.a(abyte0));
                if (abyte0.length() != 0)
                {
                    abyte0 = "Response: ".concat(abyte0);
                } else
                {
                    abyte0 = new String("Response: ");
                }
                eev.g("Babel_RequestWriter", abyte0);
                if (g.a(g.nU, "babel_debug_protobuf_parse_failure", false))
                {
                    gdv.a("Protocol buffer parsing failure");
                }
                abyte0 = String.valueOf(class1);
                eev.e("Babel_RequestWriter", (new StringBuilder(String.valueOf(abyte0).length() + 28)).append("Could not invoke parseFrom: ").append(abyte0).toString(), method);
                return null;
            }
            return method;
        } else
        {
            abyte0 = String.valueOf(class1);
            eev.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(abyte0).length() + 44)).append("Received unknown response type for request: ").append(abyte0).toString());
            return null;
        }
    }

    public static dax a()
    {
        if (a == null)
        {
            a = new dax();
            b = b();
        }
        return a;
    }

    private static byte[] a(int i, ccw ccw1, boolean flag, GenericUrl genericurl, HttpContent httpcontent, int j, int k)
    {
        android.content.Context context = g.nU;
        gdu gdu1 = (gdu)hlp.b(context, gdu);
        if (gdu1 == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        gz gz1 = new gz();
        gz1.put("Accept-Encoding", "gzip");
        if (ccw1 != null)
        {
            Object obj = dcn.e(i);
            String s = ((aoa) (obj)).a();
            if (((aoa) (obj)).D())
            {
                gz1.put("X-Goog-PageId", ((aoa) (obj)).ab());
            }
            String s1 = ccw1.a(s);
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
                ccw1 = ccw1.c(s1);
                obj = s;
                if (ccw1 != null)
                {
                    obj = ccw1.toString();
                }
            }
            gz1.put("X-Auth-Time", obj);
        }
        gz1.put("X-Device-ID", b);
        gz1.put("X-Network-ID", eco.b());
        gz1.put("User-Agent", g.h());
        if (flag)
        {
            ccw1 = kws.toByteArray(((cum)httpcontent).a);
        } else
        {
            ccw1 = null;
        }
        if (!dcz.a(i))
        {
            i = 3;
        } else
        {
            i = k;
        }
        try
        {
            ccw1 = gdu1.a(context, genericurl.toString(), gz1, ccw1, j, i);
        }
        // Misplaced declaration of an exception variable
        catch (ccw ccw1)
        {
            throw dcx.a(ccw1.getStatusCode(), ccw1, null);
        }
        return ccw1;
        ccw1 = (new hra()).createRequestFactory(a(i, ccw1, j));
        if (flag)
        {
            ccw1 = ccw1.buildPostRequest(genericurl, httpcontent);
        } else
        {
            ccw1 = ccw1.buildGetRequest(genericurl);
        }
        ccw1 = ccw1.execute();
        if (!ccw1.isSuccessStatusCode())
        {
            throw dcx.a(ccw1.getStatusCode(), null, null);
        } else
        {
            return a(((HttpResponse) (ccw1)));
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
        eev.d("Babel_RequestWriter", "Error reading response stream", ioexception1);
        httpresponse1 = httpresponse;
        throw new dcx(106, ioexception1);
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

    private static String b()
    {
        Object obj;
        try
        {
            long l = eco.a();
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

    public cxr a(GenericUrl genericurl, cwm cwm1, int i, ccw ccw1, boolean flag, int j)
    {
        if (i == -1)
        {
            return null;
        }
        int k = cwm1.p();
        com.google.api.client.http.AbstractInputStreamContent abstractinputstreamcontent;
        aoa aoa1;
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
        aoa1 = dcn.e(i);
        httpcontent = cwm1.b(dcn.e(aoa1), j, aoa1.h());
        if (httpcontent != null)
        {
            int l = g.a(g.nU, "babel_server_request_timeout", 40000);
            if (flag1)
            {
                abstractinputstreamcontent = cwm1.o();
                if (abstractinputstreamcontent == null)
                {
                    throw new dcx(122);
                }
                if (k == 1)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                ccw1 = new hqt(abstractinputstreamcontent, new hra(), a(i, ccw1, l));
                if (j != 0)
                {
                    ccw1.b();
                }
                ccw1.a(httpcontent);
                abstractinputstreamcontent = a(ccw1.a(genericurl));
                if (k == 1)
                {
                    i = 2132;
                } else
                {
                    i = 2133;
                }
                g.a(aoa1, i);
            } else
            {
                abstractinputstreamcontent = a(i, ccw1, flag, genericurl, httpcontent, l, cwm1.n());
            }
        }
        genericurl = (dlv)RequestWriter.a.get(cwm1.getClass());
        if (genericurl != null)
        {
            genericurl = ((dlv) (genericurl)).b;
        } else
        {
            genericurl = null;
        }
        return a(((byte []) (abstractinputstreamcontent)), ((cvv) (cwm1)), ((Method) (genericurl)));
    }

}
