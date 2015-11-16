// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.BackOffPolicy;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class hls
{

    boolean a;
    List b;
    boolean c;
    private final String d;
    private final List e;
    private final InputStream f;
    private int g;
    private final boolean h;

    hls(InputStream inputstream, String s, List list, boolean flag)
    {
        a = true;
        b = new ArrayList();
        g = 0;
        d = s;
        e = list;
        h = flag;
        f = inputstream;
        b(c());
    }

    private static Object a(Class class1, HttpResponse httpresponse, hlr hlr1)
    {
        if (class1 == java/lang/Void)
        {
            return null;
        } else
        {
            return hlr1.d.getParser().parseAndClose(httpresponse.getContent(), httpresponse.getContentCharset(), class1);
        }
    }

    private static String a(String s)
    {
        String s1;
        if (s.endsWith("\r\n"))
        {
            s1 = s.substring(0, s.length() - 2);
        } else
        {
            s1 = s;
            if (s.endsWith("\n"))
            {
                return s.substring(0, s.length() - 1);
            }
        }
        return s1;
    }

    private String b()
    {
        int i = f.read();
        if (i == -1)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (i == -1)
            {
                break;
            }
            stringbuilder.append((char)i);
            if (i == 10)
            {
                break;
            }
            i = f.read();
        } while (true);
        return stringbuilder.toString();
    }

    private void b(String s)
    {
        if (s.equals(String.valueOf(d).concat("--")))
        {
            a = false;
            f.close();
        }
    }

    private String c()
    {
        return a(b());
    }

    void a()
    {
        String s;
        Object obj1;
        Object obj2;
        hlo hlo1;
        HttpUnsuccessfulResponseHandler httpunsuccessfulresponsehandler;
        BackOffPolicy backoffpolicy;
        g = g + 1;
        do
        {
            s = a(b());
        } while (s != null && !s.equals(""));
        int k = Integer.parseInt(a(b()).split(" ")[1]);
        obj1 = new ArrayList();
        obj2 = new ArrayList();
        long l = -1L;
        do
        {
            s = c();
            if (s == null || s.equals(""))
            {
                break;
            }
            String as[] = s.split(": ", 2);
            s = as[0];
            String s1 = as[1];
            ((List) (obj1)).add(s);
            ((List) (obj2)).add(s1);
            if ("Content-Length".equalsIgnoreCase(s.trim()))
            {
                l = Long.parseLong(s1);
            }
        } while (true);
        Object obj;
        com.google.api.client.http.HttpHeaders httpheaders;
        if (l == -1L)
        {
            obj = new ByteArrayOutputStream();
            do
            {
                s = b();
                if (s == null || s.startsWith(d))
                {
                    break;
                }
                ((ByteArrayOutputStream) (obj)).write(s.getBytes("ISO-8859-1"));
            } while (true);
            byte abyte0[] = ((ByteArrayOutputStream) (obj)).toByteArray();
            int j = abyte0.length;
            int i = j;
            if (j > 0)
            {
                i = j;
                if (abyte0[j - 1] == 10)
                {
                    i = j - 1;
                }
            }
            j = i;
            if (i > 0)
            {
                j = i;
                if (abyte0[i - 1] == 13)
                {
                    j = i - 1;
                }
            }
            abyte0 = new ByteArrayInputStream(abyte0, 0, j);
            s = a(s);
        } else
        {
            abyte0 = new hlt(this, g.b(f, l));
        }
        obj1 = (new hlw(k, abyte0, ((List) (obj1)), ((List) (obj2)))).createRequestFactory().buildPostRequest(new GenericUrl("http://google.com/"), null);
        ((HttpRequest) (obj1)).setLoggingEnabled(false);
        ((HttpRequest) (obj1)).setThrowExceptionOnExecuteError(false);
        obj1 = ((HttpRequest) (obj1)).execute();
        obj2 = (hlr)e.get(g - 1);
        hlo1 = ((hlr) (obj2)).a;
        httpheaders = ((HttpResponse) (obj1)).getHeaders();
        httpunsuccessfulresponsehandler = ((hlr) (obj2)).d.getUnsuccessfulResponseHandler();
        backoffpolicy = ((hlr) (obj2)).d.getBackOffPolicy();
        c = false;
        if (!HttpStatusCodes.isSuccess(k)) goto _L2; else goto _L1
_L1:
        if (hlo1 != null)
        {
            hlo1.a(a(((hlr) (obj2)).b, ((HttpResponse) (obj1)), ((hlr) (obj2))), httpheaders);
        }
_L9:
        while (abyte0.skip(l) > 0L || abyte0.read() != -1) ;
        if (l != -1L)
        {
            s = c();
        }
        for (; s != null && s.length() == 0; s = c()) { }
        break; /* Loop/switch isn't completed */
_L2:
        boolean flag;
        boolean flag1;
        boolean flag2;
        HttpContent httpcontent = ((hlr) (obj2)).d.getContent();
        boolean flag3;
        if (h && (httpcontent == null || httpcontent.retrySupported()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag3 = false;
        flag1 = false;
        if (httpunsuccessfulresponsehandler != null)
        {
            flag3 = httpunsuccessfulresponsehandler.handleResponse(((hlr) (obj2)).d, ((HttpResponse) (obj1)), flag2);
        }
        flag = flag1;
        if (flag3) goto _L4; else goto _L3
_L3:
        if (!((hlr) (obj2)).d.handleRedirect(((HttpResponse) (obj1)).getStatusCode(), ((HttpResponse) (obj1)).getHeaders())) goto _L6; else goto _L5
_L5:
        flag = true;
_L4:
        if (!flag2 || !flag3 && !c && !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        b.add(obj2);
        continue; /* Loop/switch isn't completed */
_L6:
        flag = flag1;
        if (flag2)
        {
            flag = flag1;
            if (backoffpolicy != null)
            {
                flag = flag1;
                if (backoffpolicy.isBackOffRequired(((HttpResponse) (obj1)).getStatusCode()))
                {
                    c = true;
                    flag = flag1;
                }
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (hlo1 != null)
        {
            a(((hlr) (obj2)).c, ((HttpResponse) (obj1)), ((hlr) (obj2)));
            hlo1.a();
        }
        if (true) goto _L9; else goto _L8
_L8:
        b(s);
        return;
    }
}
