// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

public abstract class djq extends guy
{

    public final aoa a;
    public final String b;
    private final long c;

    public djq(Context context, String s, aoa aoa1, String s1)
    {
        this(context, s, aoa1, s1, g.a(g.nU, "babel_pending_message_failure_duration", 0x124f80L));
    }

    public djq(Context context, String s, aoa aoa1, String s1, long l)
    {
        super(context, s);
        a = aoa1;
        b = s1;
        if (l > 0L)
        {
            l = SystemClock.elapsedRealtime() + l;
        } else
        {
            l = -1L;
        }
        c = l;
    }

    protected gvv a()
    {
        Object obj;
        if (g())
        {
            obj = String.valueOf(toString());
            if (((String) (obj)).length() != 0)
            {
                obj = "The task was cancelled:".concat(((String) (obj)));
            } else
            {
                obj = new String("The task was cancelled:");
            }
            eev.c("Babel_SrvOpTask", ((String) (obj)));
            obj = new gvv(200, null, "canceled");
        } else
        {
            if (c > 0L && c < SystemClock.elapsedRealtime())
            {
                obj = String.valueOf(toString());
                if (((String) (obj)).length() != 0)
                {
                    obj = "The task expired:".concat(((String) (obj)));
                } else
                {
                    obj = new String("The task expired:");
                }
                eev.f("Babel_SrvOpTask", ((String) (obj)));
                return new gvv(0, null, "expired");
            }
            try
            {
                c();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                String s = String.valueOf(toString());
                String s2 = String.valueOf(obj);
                eev.g("Babel_SrvOpTask", (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(s2).length())).append("The task ").append(s).append(" failed in local operations ").append(s2).toString());
                return new gvv(0, ((Exception) (obj)), "local failed");
            }
            obj = b();
            if (obj == null)
            {
                obj = String.valueOf(toString());
                if (((String) (obj)).length() != 0)
                {
                    obj = "The task gets null server operation:".concat(((String) (obj)));
                } else
                {
                    obj = new String("The task gets null server operation:");
                }
                eev.c("Babel_SrvOpTask", ((String) (obj)));
                return new gvv(200, null, "no server op");
            }
            gvv gvv1;
            cxr cxr1;
            try
            {
                ((cvt) (obj)).f();
            }
            catch (dcx dcx1)
            {
                String s1 = String.valueOf(toString());
                String s3 = String.valueOf(obj);
                String s4 = String.valueOf(dcx1);
                eev.g("Babel_SrvOpTask", (new StringBuilder(String.valueOf(s1).length() + 25 + String.valueOf(s3).length() + String.valueOf(s4).length())).append("The task ").append(s1).append(" failed in ").append(s3).append(" for ").append(s4).toString());
            }
            gvv1 = new gvv(((hig) (obj)).k, ((hig) (obj)).m, "server op result");
            cxr1 = ((cvt) (obj)).e();
            obj = gvv1;
            if (cxr1 != null)
            {
                gvv1.d().putSerializable("response_header", cxr1.c);
                return gvv1;
            }
        }
        return ((gvv) (obj));
    }

    public String a(String s, String s1)
    {
        String s2;
        int i;
        long l;
        if (a != null)
        {
            i = a.h();
        } else
        {
            i = -1;
        }
        s2 = b;
        l = c;
        return (new StringBuilder(String.valueOf(s).length() + 80 + String.valueOf(s2).length() + String.valueOf(s1).length())).append(s).append(" [account=").append(i).append(", conversationId=").append(s2).append(", expirationMillis=").append(l).append(", ").append(s1).append("]").toString();
    }

    public abstract cvt b();

    public void c()
    {
    }
}
