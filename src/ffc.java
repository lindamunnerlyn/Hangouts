// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.Security;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class ffc
    implements HttpClient
{

    private static final String d[] = {
        "text/", "application/xml", "application/json"
    };
    public ffg a;
    public HttpParams b;
    private fff c;
    private Context e;
    private String f;

    private ffc(Context context, String s)
    {
        boolean flag;
        if (Security.getProvider("com.google.android.gms.common.security.ProviderInstallerImpl") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(context, s, false, flag);
    }

    private ffc(Context context, String s, boolean flag, boolean flag1)
    {
        b = new ffd(this);
        s = (new StringBuilder()).append(s).append(" (").append(Build.DEVICE).append(" ").append(Build.ID).append(")").toString();
        e = context;
        f = s;
        a = new ffg(e, flag1);
    }

    public static ffc a(String s, Context context)
    {
        return new ffc(context, s);
    }

    private static String a(HttpUriRequest httpurirequest, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("curl ");
        stringbuilder.append("-X ");
        stringbuilder.append(httpurirequest.getMethod());
        stringbuilder.append(" ");
        Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header = aheader[i];
            if (flag || !header.getName().equals("Authorization") && !header.getName().equals("Cookie"))
            {
                stringbuilder.append("--header \"");
                stringbuilder.append(header.toString().trim());
                stringbuilder.append("\" ");
            }
        }

        URI uri = httpurirequest.getURI();
        if (httpurirequest instanceof RequestWrapper)
        {
            HttpRequest httprequest = ((RequestWrapper)httpurirequest).getOriginal();
            if (httprequest instanceof HttpUriRequest)
            {
                uri = ((HttpUriRequest)httprequest).getURI();
            }
        }
        stringbuilder.append("\"");
        stringbuilder.append(uri);
        stringbuilder.append("\"");
        if (httpurirequest instanceof HttpEntityEnclosingRequest)
        {
            HttpEntity httpentity = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            if (httpentity != null && httpentity.isRepeatable())
            {
                if (httpentity.getContentLength() < 0x100000L)
                {
                    ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                    httpentity.writeTo(bytearrayoutputstream);
                    if (a(httpurirequest))
                    {
                        httpurirequest = Base64.encodeToString(bytearrayoutputstream.toByteArray(), 2);
                        stringbuilder.insert(0, (new StringBuilder("echo '")).append(httpurirequest).append("' | base64 -d > /tmp/$$.bin; ").toString());
                        stringbuilder.append(" --data-binary @/tmp/$$.bin");
                    } else
                    {
                        httpurirequest = bytearrayoutputstream.toString();
                        stringbuilder.append(" --data-ascii \"").append(httpurirequest).append("\"");
                    }
                } else
                {
                    stringbuilder.append(" [TOO MUCH DATA TO INCLUDE]");
                }
            }
        }
        return stringbuilder.toString();
    }

    private HttpResponse a(HttpURLConnection httpurlconnection)
    {
        String s;
        String s1;
        ffe ffe1;
        int i;
        s1 = null;
        i = httpurlconnection.getResponseCode();
        if (i < 0)
        {
            throw new IOException("Cannot retrieve a valid HTTP status code from server response");
        }
        a.a(httpurlconnection.getURL().toString(), i);
        ffe1 = new ffe();
        ffe1.a = httpurlconnection;
        ffe1.setStatusLine(HttpVersion.HTTP_1_1, i, httpurlconnection.getResponseMessage());
        Iterator iterator = httpurlconnection.getHeaderFields().entrySet().iterator();
        s = null;
        do
        {
label0:
            {
                Object obj;
                String s3;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj = (java.util.Map.Entry)iterator.next();
                    s3 = (String)((java.util.Map.Entry) (obj)).getKey();
                } while (s3 == null);
                Iterator iterator1 = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                obj = s;
                String s2 = s1;
                do
                {
                    s1 = s2;
                    s = ((String) (obj));
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    s = (String)iterator1.next();
                    if (s3.equalsIgnoreCase("content-type"))
                    {
                        s1 = s;
                    } else
                    {
                        s1 = ((String) (obj));
                        if (s3.equalsIgnoreCase("content-encoding"))
                        {
                            s2 = s;
                            s1 = ((String) (obj));
                        }
                    }
                    ffe1.addHeader(new BasicHeader(s3, s));
                    obj = s1;
                } while (true);
            }
        } while (true);
        if (i >= 400)
        {
            httpurlconnection = httpurlconnection.getErrorStream();
        } else
        {
            httpurlconnection = httpurlconnection.getInputStream();
        }
        if (httpurlconnection != null)
        {
            httpurlconnection = new InputStreamEntity(httpurlconnection, -1L);
            if (s != null)
            {
                httpurlconnection.setContentType(s);
            }
            if (s1 != null)
            {
                httpurlconnection.setContentEncoding(s1);
            }
            ffe1.setEntity(httpurlconnection);
        }
        return ffe1;
    }

    private void a(HttpURLConnection httpurlconnection, HttpUriRequest httpurirequest)
    {
        httpurlconnection.setRequestMethod(httpurirequest.getMethod());
        Header aheader[] = httpurirequest.getAllHeaders();
        int j = aheader.length;
        for (int i = 0; i < j; i++)
        {
            Header header1 = aheader[i];
            httpurlconnection.addRequestProperty(header1.getName(), header1.getValue());
        }

        if (httpurlconnection.getRequestProperty("User-Agent") == null)
        {
            httpurlconnection.setRequestProperty("User-Agent", f);
        }
        if ((httpurirequest instanceof HttpEntityEnclosingRequest) && ((HttpEntityEnclosingRequest)httpurirequest).getEntity() != null)
        {
            httpurirequest = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            httpurlconnection.setDoOutput(true);
            Header header;
            Header header2;
            long l;
            if (httpurirequest.isChunked())
            {
                l = -1L;
            } else
            {
                l = httpurirequest.getContentLength();
            }
            header = httpurirequest.getContentType();
            header2 = httpurirequest.getContentEncoding();
            if (l > 0L)
            {
                httpurlconnection.setRequestProperty("content-length", Long.toString(l));
            }
            if (header != null)
            {
                httpurlconnection.setRequestProperty("content-type", header.getValue());
            }
            if (header2 != null)
            {
                httpurlconnection.setRequestProperty("content-encoding", header2.getValue());
            }
            httpurirequest.writeTo(httpurlconnection.getOutputStream());
            return;
        } else
        {
            httpurlconnection.connect();
            return;
        }
    }

    private static boolean a(HttpUriRequest httpurirequest)
    {
        Header aheader[];
        int i;
        int k;
        aheader = httpurirequest.getHeaders("content-encoding");
        if (aheader == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        k = aheader.length;
        i = 0;
_L3:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (!"gzip".equalsIgnoreCase(aheader[i].getValue())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        i++;
          goto _L3
        httpurirequest = httpurirequest.getHeaders("content-type");
        if (httpurirequest != null)
        {
            int i1 = httpurirequest.length;
            int j = 0;
            while (j < i1) 
            {
                Header header = httpurirequest[j];
                String as[] = d;
                int j1 = as.length;
                for (int l = 0; l < j1; l++)
                {
                    String s = as[l];
                    if (header.getValue().startsWith(s))
                    {
                        return false;
                    }
                }

                j++;
            }
        }
          goto _L1
    }

    private HttpResponse b(HttpUriRequest httpurirequest)
    {
        long l;
label0:
        {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())
            {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
            if (!(httpurirequest instanceof HttpEntityEnclosingRequest))
            {
                break label0;
            }
            Object obj = ((HttpEntityEnclosingRequest)httpurirequest).getEntity();
            RequestWrapper requestwrapper;
            if (obj == null)
            {
                l = 0L;
            } else
            {
                if (((HttpEntity) (obj)).isChunked())
                {
                    break label0;
                }
                l = ((HttpEntity) (obj)).getContentLength();
            }
        }
_L1:
        if (l >= 0L)
        {
            httpurirequest.addHeader("content-length", Long.toString(l));
        }
        obj = c;
        if (obj != null && ((fff) (obj)).a())
        {
            ((fff) (obj)).a(a(httpurirequest, ((fff) (obj)).a));
        }
        obj = httpurirequest.getURI().toURL();
        obj = a.a(((URL) (obj)), null);
        ((HttpURLConnection) (obj)).setInstanceFollowRedirects(false);
        if (!httpurirequest.getURI().toString().equals(((HttpURLConnection) (obj)).getURL().toString()))
        {
            requestwrapper = c(httpurirequest);
            try
            {
                requestwrapper.setURI(((HttpURLConnection) (obj)).getURL().toURI());
            }
            catch (URISyntaxException urisyntaxexception) { }
        }
        a(((HttpURLConnection) (obj)), httpurirequest);
        return a(((HttpURLConnection) (obj)));
        l = -1L;
          goto _L1
    }

    private static RequestWrapper c(HttpUriRequest httpurirequest)
    {
        if (!(httpurirequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        httpurirequest = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httpurirequest);
_L1:
        httpurirequest.resetHeaders();
        return httpurirequest;
        try
        {
            httpurirequest = new RequestWrapper(httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw new ClientProtocolException(httpurirequest);
        }
          goto _L1
    }

    public void a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("name");
        } else
        {
            c = new fff(s, 2, false);
            return;
        }
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        throw new UnsupportedOperationException();
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        throw new UnsupportedOperationException();
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return execute(httpurirequest, responsehandler, ((HttpContext) (null)));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        throw new UnsupportedOperationException();
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        return b(httpurirequest);
    }

    public ClientConnectionManager getConnectionManager()
    {
        throw new UnsupportedOperationException();
    }

    public HttpParams getParams()
    {
        return b;
    }

}
