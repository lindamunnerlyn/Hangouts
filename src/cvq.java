// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvq extends cvn
{

    private static final long serialVersionUID = 1L;

    private cvq()
    {
    }

    private cvq(ivo ivo1)
    {
        super(ivo1.responseHeader, 0L);
        if (cvn.a)
        {
            ivo1 = String.valueOf(ivo1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ivo1).length() + 33)).append("ArchiveConversationResponse from:").append(ivo1).toString());
        }
    }

    public static cvq k()
    {
        return new cvq();
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (ivo)kop.mergeFrom(new ivo(), abyte0);
        if (a(((ivo) (abyte0)).responseHeader))
        {
            return new cvz(((ivo) (abyte0)).responseHeader);
        } else
        {
            return new cvq(abyte0);
        }
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
    }
}
