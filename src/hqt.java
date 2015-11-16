// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GZipEncoding;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.MultipartContent;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Arrays;

public final class hqt
{

    String a;
    hsz b;
    private int c;
    private final AbstractInputStreamContent d;
    private final HttpRequestFactory e;
    private final HttpTransport f;
    private HttpContent g;
    private long h;
    private boolean i;
    private String j;
    private HttpHeaders k;
    private HttpRequest l;
    private InputStream m;
    private boolean n;
    private long o;
    private int p;
    private Byte q;
    private long r;
    private int s;
    private byte t[];
    private boolean u;

    public hqt(AbstractInputStreamContent abstractinputstreamcontent, HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        c = hqu.a;
        j = "POST";
        k = new HttpHeaders();
        a = "*";
        p = 0xa00000;
        b = hsz.a;
        d = (AbstractInputStreamContent)h.a(abstractinputstreamcontent);
        f = (HttpTransport)h.a(httptransport);
        if (httprequestinitializer == null)
        {
            abstractinputstreamcontent = httptransport.createRequestFactory();
        } else
        {
            abstractinputstreamcontent = httptransport.createRequestFactory(httprequestinitializer);
        }
        e = abstractinputstreamcontent;
    }

    private static HttpResponse a(HttpRequest httprequest)
    {
        (new hqf()).intercept(httprequest);
        httprequest.setThrowExceptionOnExecuteError(false);
        return httprequest.execute();
    }

    private HttpResponse b(GenericUrl genericurl)
    {
        c = hqu.d;
        Object obj = d;
        if (g != null)
        {
            obj = (new MultipartContent()).setContentParts(Arrays.asList(new HttpContent[] {
                g, d
            }));
            genericurl.put("uploadType", "multipart");
        } else
        {
            genericurl.put("uploadType", "media");
        }
        genericurl = e.buildRequest(j, genericurl, ((HttpContent) (obj)));
        genericurl.getHeaders().putAll(k);
        genericurl = b(((HttpRequest) (genericurl)));
        if (c())
        {
            o = d();
        }
        c = hqu.e;
        return genericurl;
        Exception exception;
        exception;
        genericurl.disconnect();
        throw exception;
    }

    private HttpResponse b(HttpRequest httprequest)
    {
        if (!u && !(httprequest.getContent() instanceof EmptyContent))
        {
            httprequest.setEncoding(new GZipEncoding());
        }
        return a(httprequest);
    }

    private HttpResponse c(GenericUrl genericurl)
    {
        Object obj1 = d(genericurl);
        if (((HttpResponse) (obj1)).isSuccessStatusCode()) goto _L2; else goto _L1
_L1:
        return ((HttpResponse) (obj1));
_L2:
        genericurl = new GenericUrl(((HttpResponse) (obj1)).getHeaders().getLocation());
        Object obj;
        ((HttpResponse) (obj1)).disconnect();
        m = d.getInputStream();
        obj = genericurl;
        if (!m.markSupported())
        {
            obj = genericurl;
            if (c())
            {
                m = new BufferedInputStream(m);
                obj = genericurl;
            }
        }
_L8:
        boolean flag1;
        l = e.buildPutRequest(((GenericUrl) (obj)), null);
        int i1;
        if (c())
        {
            i1 = (int)Math.min(p, d() - o);
        } else
        {
            i1 = p;
        }
        if (c())
        {
            m.mark(i1);
            genericurl = g.b(m, i1);
            genericurl = (new InputStreamContent(d.getType(), genericurl)).setRetrySupported(true).setLength(i1).setCloseInputStream(false);
            a = String.valueOf(d());
        } else
        {
            if (t == null)
            {
                int j1;
                int k1;
                int l1;
                if (q == null)
                {
                    j1 = i1 + 1;
                } else
                {
                    j1 = i1;
                }
                t = new byte[i1 + 1];
                long l2;
                long l3;
                long l4;
                if (q != null)
                {
                    t[0] = q.byteValue();
                    boolean flag = false;
                    k1 = j1;
                    j1 = ((flag) ? 1 : 0);
                } else
                {
                    k1 = j1;
                    j1 = 0;
                }
            } else
            {
                j1 = (int)(r - o);
                System.arraycopy(t, s - j1, t, 0, j1);
                if (q != null)
                {
                    t[j1] = q.byteValue();
                }
                k1 = i1 - j1;
            }
            l1 = g.a(m, t, (i1 + 1) - k1, k1);
            if (l1 < k1)
            {
                j1 = Math.max(0, l1) + j1;
                i1 = j1;
                if (q != null)
                {
                    i1 = j1 + 1;
                    q = null;
                }
                j1 = i1;
                if (a.equals("*"))
                {
                    a = String.valueOf(o + (long)i1);
                    j1 = i1;
                }
            } else
            {
                q = Byte.valueOf(t[i1]);
                j1 = i1;
            }
            genericurl = new ByteArrayContent(d.getType(), t, 0, j1);
            r = o + (long)j1;
            i1 = j1;
        }
        s = i1;
        l.setContent(genericurl);
        if (i1 == 0)
        {
            l.getHeaders().setContentRange("bytes */0");
        } else
        {
            genericurl = l.getHeaders();
            l2 = o;
            l3 = o;
            l4 = i1;
            obj1 = a;
            genericurl.setContentRange((new StringBuilder(String.valueOf(obj1).length() + 48)).append("bytes ").append(l2).append("-").append((l3 + l4) - 1L).append("/").append(((String) (obj1))).toString());
        }
        new hqv(this, l);
        if (c())
        {
            genericurl = a(l);
        } else
        {
            genericurl = b(l);
        }
        if (!genericurl.isSuccessStatusCode())
        {
            break MISSING_BLOCK_LABEL_715;
        }
        o = d();
        if (d.getCloseInputStream())
        {
            m.close();
        }
        c = hqu.e;
        return genericurl;
        obj;
        genericurl.disconnect();
        throw obj;
        genericurl;
        ((HttpResponse) (obj1)).disconnect();
        throw genericurl;
        obj1 = genericurl;
        if (genericurl.getStatusCode() != 308) goto _L1; else goto _L3
_L3:
        obj1 = genericurl.getHeaders().getLocation();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_748;
        }
        obj = new GenericUrl(((String) (obj1)));
        obj1 = genericurl.getHeaders().getRange();
        if (obj1 != null) goto _L5; else goto _L4
_L4:
        l2 = 0L;
_L9:
        l3 = l2 - o;
        if (l3 < 0L)
        {
            break MISSING_BLOCK_LABEL_919;
        }
        if (l3 > (long)s)
        {
            break MISSING_BLOCK_LABEL_919;
        }
        flag1 = true;
_L12:
        l.b(flag1);
        l4 = (long)s - l3;
        if (!c()) goto _L7; else goto _L6
_L6:
        if (l4 <= 0L)
        {
            break MISSING_BLOCK_LABEL_852;
        }
        m.reset();
        if (l3 == m.skip(l3))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l.b(flag1);
_L11:
        o = l2;
        c = hqu.d;
        genericurl.disconnect();
          goto _L8
_L5:
        l2 = Long.parseLong(((String) (obj1)).substring(((String) (obj1)).indexOf('-') + 1)) + 1L;
          goto _L9
_L7:
        if (l4 != 0L) goto _L11; else goto _L10
_L10:
        t = null;
          goto _L11
        flag1 = false;
          goto _L12
    }

    private boolean c()
    {
        return d() >= 0L;
    }

    private long d()
    {
        if (!i)
        {
            h = d.getLength();
            i = true;
        }
        return h;
    }

    private HttpResponse d(GenericUrl genericurl)
    {
        c = hqu.b;
        genericurl.put("uploadType", "resumable");
        Object obj;
        if (g == null)
        {
            obj = new EmptyContent();
        } else
        {
            obj = g;
        }
        genericurl = e.buildRequest(j, genericurl, ((HttpContent) (obj)));
        k.set("X-Upload-Content-Type", d.getType());
        if (c())
        {
            k.set("X-Upload-Content-Length", Long.valueOf(d()));
        }
        genericurl.getHeaders().putAll(k);
        genericurl = b(genericurl);
        c = hqu.c;
        return genericurl;
        Exception exception;
        exception;
        genericurl.disconnect();
        throw exception;
    }

    public HttpResponse a(GenericUrl genericurl)
    {
        boolean flag;
        if (c == hqu.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        if (n)
        {
            return b(genericurl);
        } else
        {
            return c(genericurl);
        }
    }

    public hqt a(HttpContent httpcontent)
    {
        g = httpcontent;
        return this;
    }

    void a()
    {
        l.b(l, "The current request should not be null");
        l.setContent(new EmptyContent());
        HttpHeaders httpheaders = l.getHeaders();
        Object obj;
        if (c())
        {
            obj = Long.valueOf(d());
        } else
        {
            obj = "*";
        }
        obj = String.valueOf(obj);
        httpheaders.setContentRange((new StringBuilder(String.valueOf(obj).length() + 8)).append("bytes */").append(((String) (obj))).toString());
    }

    public hqt b()
    {
        n = true;
        return this;
    }
}
