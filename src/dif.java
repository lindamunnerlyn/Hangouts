// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

public abstract class dif extends gqn
{

    public final ani a;
    public final String b;
    private final long e;

    public dif(Context context, String s, ani ani1, String s1)
    {
        this(context, s, ani1, s1, g.a(g.nS, "babel_pending_message_failure_duration", 0x124f80L));
    }

    public dif(Context context, String s, ani ani1, String s1, long l)
    {
        super(context, s);
        a = ani1;
        b = s1;
        if (l > 0L)
        {
            l = SystemClock.elapsedRealtime() + l;
        } else
        {
            l = -1L;
        }
        e = l;
    }

    protected grk a()
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
            ebw.c("Babel_SrvOpTask", ((String) (obj)));
            obj = new grk(200, null, "canceled");
        } else
        {
            if (e > 0L && e < SystemClock.elapsedRealtime())
            {
                obj = String.valueOf(toString());
                if (((String) (obj)).length() != 0)
                {
                    obj = "The task expired:".concat(((String) (obj)));
                } else
                {
                    obj = new String("The task expired:");
                }
                ebw.f("Babel_SrvOpTask", ((String) (obj)));
                return new grk(0, null, "expired");
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
                ebw.g("Babel_SrvOpTask", (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(s2).length())).append("The task ").append(s).append(" failed in local operations ").append(s2).toString());
                return new grk(0, ((Exception) (obj)), "local failed");
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
                ebw.c("Babel_SrvOpTask", ((String) (obj)));
                return new grk(200, null, "no server op");
            }
            grk grk1;
            cvn cvn1;
            try
            {
                ((ctp) (obj)).f();
            }
            catch (dbo dbo1)
            {
                String s1 = String.valueOf(toString());
                String s3 = String.valueOf(obj);
                String s4 = String.valueOf(dbo1);
                ebw.g("Babel_SrvOpTask", (new StringBuilder(String.valueOf(s1).length() + 25 + String.valueOf(s3).length() + String.valueOf(s4).length())).append("The task ").append(s1).append(" failed in ").append(s3).append(" for ").append(s4).toString());
            }
            grk1 = new grk(((hdp) (obj)).k, ((hdp) (obj)).m, "server op result");
            cvn1 = ((ctp) (obj)).e();
            obj = grk1;
            if (cvn1 != null)
            {
                grk1.d().putSerializable("response_header", cvn1.c);
                return grk1;
            }
        }
        return ((grk) (obj));
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
        l = e;
        return (new StringBuilder(String.valueOf(s).length() + 80 + String.valueOf(s2).length() + String.valueOf(s1).length())).append(s).append(" [account=").append(i).append(", conversationId=").append(s2).append(", expirationMillis=").append(l).append(", ").append(s1).append("]").toString();
    }

    public abstract ctp b();

    public void c()
    {
    }
}
