// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;

public abstract class cvv
    implements cdl, dmf
{

    static final boolean e = false;
    public static final String f;
    private static final long serialVersionUID = 1L;
    private final String a = eev.a(new Throwable());
    private String b;
    public int g;
    public transient efu h;
    public String i;

    public cvv()
    {
        g = 0;
    }

    private static void a(int i1, cwx cwx1, long l1, int j1)
    {
        h.a(i1, l1, j1, (new cab()).b(cwx1.j).a(cwx1.c));
    }

    public static boolean c(String s)
    {
        long l1 = def.a();
        if (l1 != 0L)
        {
            return Long.toString(l1).equals(s);
        } else
        {
            return false;
        }
    }

    public abstract cxr a(Context context, cdn cdn1);

    public dcx a(long l1, int i1)
    {
        return null;
    }

    public String a()
    {
        return "default_queue";
    }

    protected String a(Context context)
    {
        context = String.valueOf(((dmh)hlp.a(context, dmh)).a(g()));
        String s = String.valueOf(f());
        if (s.length() != 0)
        {
            return context.concat(s);
        } else
        {
            return new String(context);
        }
    }

    public abstract kws a(String s, int i1, int j1);

    public void a(int i1)
    {
        g = i1;
    }

    public void a(int i1, dcx dcx1)
    {
        aoa aoa = dcn.e(i1);
        if (aoa != null)
        {
            a(aoa, dcx1);
            RealTimeChatService.a(aoa, this, dcx1);
        } else
        if (eev.a("Babel_RequestWriter", 3))
        {
            eev.c("Babel_RequestWriter", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i1).toString());
            return;
        }
    }

    public void a(Context context, cdn cdn1, cdp cdp)
    {
        long l1 = SystemClock.elapsedRealtime();
        int i1 = cdn1.c;
        boolean flag = this instanceof cwx;
        if (flag)
        {
            a(i1, (cwx)this, l1, 2);
        }
        context = a(context, cdn1);
        long l3 = SystemClock.elapsedRealtime();
        if (flag)
        {
            cdp = (cwx)this;
            long l2;
            if (context != null)
            {
                l2 = l3;
            } else
            {
                l2 = 0L;
            }
            a(i1, ((cwx) (cdp)), l2, 12);
        }
        if (context != null)
        {
            context.b(1000L * l3);
            context.a(this);
            RealTimeChatService.a(cdn1.c, context);
            return;
        } else
        {
            throw new dcx(111);
        }
    }

    public void a(aoa aoa, dcx dcx1)
    {
    }

    protected boolean a(Context context, int i1, dcx dcx1)
    {
        if (i1 == 0)
        {
            if ((i1 = dcx1.c()) == 104 || i1 == 103)
            {
                return true;
            }
        }
        return false;
    }

    public boolean a(cdl cdl1)
    {
        return false;
    }

    public boolean a(cdn cdn1, dcx dcx1)
    {
        return djp.a(cdn1, dcx1.c());
    }

    protected boolean a(dcx dcx1)
    {
        return dcx1.c() == 104;
    }

    public boolean a(String s)
    {
        return false;
    }

    public long b()
    {
        return g.a(g.nU, "babel_pending_message_failure_duration", 0x124f80L);
    }

    public GenericUrl b(Context context)
    {
        context.getContentResolver();
        GenericUrl genericurl = new GenericUrl(eep.b(a(context)));
        context = i();
        if (!TextUtils.isEmpty(context))
        {
            context = String.valueOf(context);
            if (context.length() != 0)
            {
                context = "token:".concat(context);
            } else
            {
                context = new String("token:");
            }
            genericurl.put("trace", context);
        }
        return genericurl;
    }

    public HttpContent b(String s, int i1, int j1)
    {
        s = a(s, i1, j1);
        if (s != null)
        {
            i = s.toString();
            return new cum(s);
        } else
        {
            return null;
        }
    }

    public dcx b(long l1, int i1)
    {
        return null;
    }

    public void b(String s)
    {
        b = s;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return true;
    }

    public String e()
    {
        return null;
    }

    public abstract String f();

    protected dmi g()
    {
        return dmi.a;
    }

    public boolean h()
    {
        return true;
    }

    protected String i()
    {
        return g.a(g.nU, "babel_apiary_trace_token", dlb.a);
    }

    public boolean j()
    {
        return false;
    }

    public int k()
    {
        return g;
    }

    public void l()
    {
        h = (efu)hlp.a(g.nU, efu);
    }

    public cdl m()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append("-").append(hashCode()).append(": ").append(f());
        if (((amo)hlp.a(g.nU, amo)).a("babel_server_request_verbose_logging", false))
        {
            StringBuilder stringbuilder1 = stringbuilder.append("\nProtoBuf:\n");
            String s;
            if (i == null)
            {
                s = "not built yet";
            } else
            {
                s = i;
            }
            stringbuilder1.append(s).append("\nCreation stack:\n").append(a).append("\nOrigin stack:\n").append(b);
        }
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = eev.k;
        obj = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation  https://www.googleapis.com/auth/chat.native";
        try
        {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            classnotfoundexception = "oauth2:https://www.googleapis.com/auth/chat https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.peopleapi.readwrite https://www.googleapis.com/auth/hangouts https://www.googleapis.com/auth/identity.plus.page.impersonation ";
        }
        f = ((String) (obj));
    }
}
