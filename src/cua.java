// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
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

public final class cua extends cvv
{

    private static final boolean a = false;
    private static final long serialVersionUID = 2L;
    private final String b;

    public cua(String s)
    {
        b = s;
    }

    public cxr a(Context context, cdn cdn1)
    {
        Object obj;
        if (a)
        {
            obj = String.valueOf(cdn1.toString());
            Object obj1;
            llg llg1;
            if (((String) (obj)).length() != 0)
            {
                obj = "[SEND] ".concat(((String) (obj)));
            } else
            {
                obj = new String("[SEND] ");
            }
            eev.b("Babel", ((String) (obj)));
        }
        obj1 = b(context);
        l();
        obj = new File(b);
        if (((File) (obj)).exists())
        {
            context = dcn.e(cdn1.c).a();
            cdn1 = new DefaultHttpClient();
            obj1 = new HttpPost(((GenericUrl) (obj1)).toURI());
            try
            {
                llg1 = new llg();
                llg1.a("prod", new llj("Google_Hangouts_Android"));
                llg1.a("ver", new llj(String.valueOf(h.c()).concat("-calls")));
                llg1.a("email", new llj(context));
                llg1.a("type", new llj("log"));
                llg1.a("log", new lli(((File) (obj))));
                ((HttpPost) (obj1)).setEntity(llg1);
                context = cdn1.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
            // Misplaced declaration of an exception variable
            catch (cdn cdn1)
            {
                context = String.valueOf(cdn1.toString());
                if (context.length() != 0)
                {
                    context = "Crash log upload failed due to ClientProtocolException ".concat(context);
                } else
                {
                    context = new String("Crash log upload failed due to ClientProtocolException ");
                }
                eev.f("Babel", context);
                throw new dcx(114, cdn1);
            }
            // Misplaced declaration of an exception variable
            catch (cdn cdn1)
            {
                context = String.valueOf(cdn1.toString());
                if (context.length() != 0)
                {
                    context = "Crash log upload failed due to IOException ".concat(context);
                } else
                {
                    context = new String("Crash log upload failed due to IOException ");
                }
                eev.f("Babel", context);
                throw new dcx(102, cdn1);
            }
            if (context == null || context.getStatusLine().getStatusCode() != 200)
            {
                eev.f("Babel", "Crash log upload unsuccessful.");
                throw new dcx(108);
            } else
            {
                eev.e("Babel", "Crash log successfully uploaded.");
                ((File) (obj)).delete();
                return null;
            }
        }
        context = String.valueOf(((File) (obj)).getAbsolutePath());
        if (context.length() != 0)
        {
            context = "Crash no such log file ".concat(context);
        } else
        {
            context = new String("Crash no such log file ");
        }
        eev.e("Babel", context);
        return null;
    }

    public String a()
    {
        return "background_queue";
    }

    protected String a(Context context)
    {
        context = String.valueOf("https://clients2.google.com");
        String s = String.valueOf(f());
        if (s.length() != 0)
        {
            return context.concat(s);
        } else
        {
            return new String(context);
        }
    }

    public kws a(String s, int i, int j)
    {
        return null;
    }

    public void a(aoa aoa1, dcx dcx1)
    {
        aoa1 = new File(b);
        if (aoa1.exists())
        {
            aoa1.delete();
        }
    }

    public long b()
    {
        return TimeUnit.HOURS.toMillis(24L);
    }

    public String f()
    {
        return "/cr/report";
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
