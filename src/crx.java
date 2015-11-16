// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public final class crx extends ctr
{

    private static final boolean a = false;
    private static final long serialVersionUID = 2L;
    private final String b;

    public crx(String s)
    {
        b = s;
    }

    public cvn a(cci cci1)
    {
        Object obj;
        if (a)
        {
            obj = String.valueOf(cci1.toString());
            DefaultHttpClient defaulthttpclient;
            Object obj1;
            lcs lcs1;
            if (((String) (obj)).length() != 0)
            {
                obj = "[SEND] ".concat(((String) (obj)));
            } else
            {
                obj = new String("[SEND] ");
            }
            ebw.b("Babel", ((String) (obj)));
        }
        obj1 = h();
        m();
        obj = new File(b);
        if (((File) (obj)).exists())
        {
            cci1 = dbf.e(cci1.c).a();
            defaulthttpclient = new DefaultHttpClient();
            obj1 = new HttpPost(((GenericUrl) (obj1)).toURI());
            try
            {
                lcs1 = new lcs();
                lcs1.a("prod", new lcv("Google_Hangouts_Android"));
                lcs1.a("ver", new lcv(String.valueOf(h.c()).concat("-calls")));
                lcs1.a("email", new lcv(cci1));
                lcs1.a("type", new lcv("log"));
                lcs1.a("log", new lcu(((File) (obj))));
                ((HttpPost) (obj1)).setEntity(lcs1);
                cci1 = defaulthttpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (cci cci1)
            {
                cci1 = null;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                cci1 = String.valueOf(((ClientProtocolException) (obj)).toString());
                if (cci1.length() != 0)
                {
                    cci1 = "Crash log upload failed due to ClientProtocolException ".concat(cci1);
                } else
                {
                    cci1 = new String("Crash log upload failed due to ClientProtocolException ");
                }
                ebw.f("Babel", cci1);
                throw new dbo(114, ((Exception) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                cci1 = String.valueOf(((IOException) (obj)).toString());
                if (cci1.length() != 0)
                {
                    cci1 = "Crash log upload failed due to IOException ".concat(cci1);
                } else
                {
                    cci1 = new String("Crash log upload failed due to IOException ");
                }
                ebw.f("Babel", cci1);
                throw new dbo(102, ((Exception) (obj)));
            }
            if (cci1 == null || cci1.getStatusLine().getStatusCode() != 200)
            {
                ebw.f("Babel", "Crash log upload unsuccessful.");
                throw new dbo(108);
            } else
            {
                ebw.e("Babel", "Crash log successfully uploaded.");
                ((File) (obj)).delete();
                return null;
            }
        }
        cci1 = String.valueOf(((File) (obj)).getAbsolutePath());
        if (cci1.length() != 0)
        {
            cci1 = "Crash no such log file ".concat(cci1);
        } else
        {
            cci1 = new String("Crash no such log file ");
        }
        ebw.e("Babel", cci1);
        return null;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int j)
    {
        return null;
    }

    public void a(ani ani1, dbo dbo1)
    {
        ani1 = new File(b);
        if (ani1.exists())
        {
            ani1.delete();
        }
    }

    public long b()
    {
        return TimeUnit.HOURS.toMillis(24L);
    }

    protected String f()
    {
        String s = String.valueOf("https://clients2.google.com");
        String s1 = String.valueOf(g());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public String g()
    {
        return "/cr/report";
    }

    static 
    {
        hik hik = ebw.k;
    }
}
