// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dei extends dfa
{

    private final byte a[];
    private final byte d[];

    public dei(ani ani, byte abyte0[], byte abyte1[])
    {
        super(ani);
        a = abyte0;
        d = abyte1;
    }

    public void a()
    {
        c.a(new ctk(a, d));
    }
}
