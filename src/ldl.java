// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ldl extends IllegalArgumentException
{

    private static final long serialVersionUID = 0x299988b9c68L;

    public ldl(long l, String s)
    {
        String s1 = lfn.a("yyyy-MM-dd'T'HH:mm:ss.SSS").a(new ldm(l));
        if (s != null)
        {
            s = (new StringBuilder(String.valueOf(s).length() + 3)).append(" (").append(s).append(")").toString();
        } else
        {
            s = "";
        }
        super((new StringBuilder(String.valueOf(s1).length() + 82 + String.valueOf(s).length())).append("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ").append(s1).append(s).toString());
    }

    public ldl(String s)
    {
        super(s);
    }
}
