// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cxh extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cxh(String s)
    {
        a = s;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            Object obj = String.valueOf(a);
            Object obj1;
            iwx iwx1;
            if (((String) (obj)).length() != 0)
            {
                obj = "SetStatusMessageRequest.buildProtobuf: statusMessage=".concat(((String) (obj)));
            } else
            {
                obj = new String("SetStatusMessageRequest.buildProtobuf: statusMessage=");
            }
            eev.b("Babel_RequestWriter", ((String) (obj)));
        }
        obj = new jfb();
        if (!TextUtils.isEmpty(a))
        {
            obj1 = new lcv();
            obj1.b = a;
            obj1.a = Integer.valueOf(0);
            iwx1 = new iwx();
            iwx1.a = (new lcv[] {
                obj1
            });
            obj.a = (new iwx[] {
                iwx1
            });
        }
        obj1 = new jel();
        obj1.f = ((jfb) (obj));
        obj1.requestHeader = cvu.a(s, i, j, h);
        return ((kws) (obj1));
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return true;
    }

    public boolean a(String s)
    {
        return TextUtils.equals(s, a);
    }

    public String f()
    {
        return "presence/setpresence";
    }
}
