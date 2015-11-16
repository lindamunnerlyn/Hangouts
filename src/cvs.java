// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvs extends cvn
{

    private static final long serialVersionUID = 1L;
    private final String g;

    private cvs(jax jax1)
    {
        if (jax1.a != null)
        {
            g = jax1.a.a;
        } else
        {
            g = null;
        }
        if (cvn.a)
        {
            jax1 = String.valueOf(jax1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(jax1).length() + 29)).append("CreateHangoutIdResponse from:").append(jax1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (jax)kop.mergeFrom(new jax(), abyte0);
        if (a(((jax) (abyte0)).responseHeader))
        {
            return new cvz(((jax) (abyte0)).responseHeader);
        } else
        {
            return new cvs(abyte0);
        }
    }

    public String k()
    {
        return g;
    }
}
