// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cvd extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cvd(String s)
    {
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            Object obj = String.valueOf(a);
            Object obj1;
            iqs iqs1;
            if (((String) (obj)).length() != 0)
            {
                obj = "SetStatusMessageRequest.buildProtobuf: statusMessage=".concat(((String) (obj)));
            } else
            {
                obj = new String("SetStatusMessageRequest.buildProtobuf: statusMessage=");
            }
            ebw.b("Babel_RequestWriter", ((String) (obj)));
        }
        obj = new iyw();
        if (!TextUtils.isEmpty(a))
        {
            obj1 = new kur();
            obj1.b = a;
            obj1.a = Integer.valueOf(0);
            iqs1 = new iqs();
            iqs1.a = (new kur[] {
                obj1
            });
            obj.a = (new iqs[] {
                iqs1
            });
        }
        obj1 = new iyg();
        obj1.f = ((iyw) (obj));
        obj1.requestHeader = ctq.a(s, i, j, h);
        return ((kop) (obj1));
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return true;
    }

    public boolean a(String s)
    {
        return TextUtils.equals(s, a);
    }

    public String g()
    {
        return "presence/setpresence";
    }
}
