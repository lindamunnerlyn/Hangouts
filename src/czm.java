// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class czm extends cxr
{

    private static final long serialVersionUID = 1L;
    private int g;
    private String h;
    private final String i;

    private czm(jda jda1)
    {
        super(jda1.responseHeader, -1L);
        g = g.a(jda1.a, 0);
        h = jda1.b;
        i = jda1.c;
        if (cxr.a)
        {
            jda1 = String.valueOf(jda1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jda1).length() + 28)).append("RegisterDeviceResponse from:").append(jda1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jda)kws.mergeFrom(new jda(), abyte0);
        if (a(((jda) (abyte0)).responseHeader))
        {
            return new cyd(((jda) (abyte0)).responseHeader);
        } else
        {
            return new czm(abyte0);
        }
    }

    public void a(dmf dmf)
    {
        super.a(dmf);
        dmf = (cwr)b;
        if (((cwr) (dmf)).u != null)
        {
            g = 2;
            h = ((cwr) (dmf)).u;
        }
    }

    public int k()
    {
        return ((cwr)b).a;
    }

    public String l()
    {
        return ((cwr)b).m;
    }

    public String m()
    {
        return i;
    }

    public int n()
    {
        return g;
    }

    public String o()
    {
        return h;
    }

    public boolean p()
    {
        return ((cwr)b).k;
    }
}
