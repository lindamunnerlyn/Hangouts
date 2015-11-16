// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;

public abstract class ctr
    implements ccg, dko
{

    static final boolean e = false;
    public static final String f;
    private static final long serialVersionUID = 1L;
    private final String a = ebw.a(new Throwable());
    private String b;
    public int g;
    public transient ecs h;
    public String i;

    public ctr()
    {
        g = 0;
    }

    private static void a(int i1, cut cut1, long l1, int j1)
    {
        h.a(i1, l1, j1, (new byy()).b(cut1.j).a(cut1.c));
    }

    public static boolean c(String s)
    {
        long l1 = dcx.a();
        if (l1 != 0L)
        {
            return Long.toString(l1).equals(s);
        } else
        {
            return false;
        }
    }

    public abstract cvn a(cci cci1);

    public dbo a(long l1, int i1)
    {
        return null;
    }

    public String a()
    {
        return "default_queue";
    }

    public abstract kop a(String s, int i1, int j1);

    public void a(int i1)
    {
        g = i1;
    }

    public void a(int i1, dbo dbo1)
    {
        ani ani = dbf.e(i1);
        if (ani != null)
        {
            a(ani, dbo1);
            RealTimeChatService.a(ani, this, dbo1);
        } else
        if (ebw.a("Babel_RequestWriter", 3))
        {
            ebw.c("Babel_RequestWriter", (new StringBuilder(57)).append("Skipping request failure for invalid account: ").append(i1).toString());
            return;
        }
    }

    public void a(Context context, cci cci1, cck cck)
    {
        long l1 = SystemClock.elapsedRealtime();
        int i1 = cci1.c;
        boolean flag = this instanceof cut;
        if (flag)
        {
            a(i1, (cut)this, l1, 2);
        }
        context = a(cci1);
        long l3 = SystemClock.elapsedRealtime();
        if (flag)
        {
            cck = (cut)this;
            long l2;
            if (context != null)
            {
                l2 = l3;
            } else
            {
                l2 = 0L;
            }
            a(i1, ((cut) (cck)), l2, 12);
        }
        if (context != null)
        {
            context.b(1000L * l3);
            context.a(this);
            RealTimeChatService.a(cci1.c, context);
            return;
        } else
        {
            throw new dbo(111);
        }
    }

    public void a(ani ani, dbo dbo1)
    {
    }

    public boolean a(ccg ccg1)
    {
        return false;
    }

    public boolean a(cci cci1, dbo dbo1)
    {
        return die.a(cci1, dbo1.c());
    }

    protected boolean a(dbo dbo1)
    {
        int i1 = dbo1.c();
        return i1 == 104 || i1 == 103;
    }

    public boolean a(String s)
    {
        return false;
    }

    public long b()
    {
        return g.a(g.nS, "babel_pending_message_failure_duration", 0x124f80L);
    }

    public HttpContent b(String s, int i1, int j1)
    {
        s = a(s, i1, j1);
        if (s != null)
        {
            i = s.toString();
            return new csj(s);
        } else
        {
            return null;
        }
    }

    public dbo b(long l1, int i1)
    {
        return null;
    }

    public void b(String s)
    {
        b = s;
    }

    protected boolean b(dbo dbo1)
    {
        return dbo1.c() == 104;
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

    protected String f()
    {
        String s = String.valueOf("https://www.googleapis.com/chat/v1android/");
        String s1 = String.valueOf(g());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public abstract String g();

    public GenericUrl h()
    {
        g.nS.getContentResolver();
        GenericUrl genericurl = new GenericUrl(ebr.b(f()));
        String s = j();
        if (!TextUtils.isEmpty(s))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "token:".concat(s);
            } else
            {
                s = new String("token:");
            }
            genericurl.put("trace", s);
        }
        return genericurl;
    }

    public boolean i()
    {
        return true;
    }

    protected String j()
    {
        return g.a(g.nS, "babel_apiary_trace_token", djk.a);
    }

    public boolean k()
    {
        return false;
    }

    public int l()
    {
        return g;
    }

    public void m()
    {
        h = (ecs)hgx.a(g.nS, ecs);
    }

    public ccg n()
    {
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName()).append("-").append(hashCode()).append(": ").append(g());
        if (((alw)hgx.a(g.nS, alw)).a("babel_server_request_verbose_logging", false))
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
        Object obj = ebw.k;
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
