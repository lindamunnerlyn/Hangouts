// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ctc extends cui
{

    private static final long serialVersionUID = 1L;

    public ctc()
    {
    }

    protected String f()
    {
        String s = String.valueOf("https://www.googleapis.com/hangouts/v1android/");
        String s1 = String.valueOf(g());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    protected String j()
    {
        return g.a(g.nS, "babel_room_server_apiary_trace_token", djk.b);
    }
}
