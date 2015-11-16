// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyh extends cvn
{

    private static final long serialVersionUID = 1L;

    private cyh(iym iym1)
    {
        super(iym1.responseHeader, g.a(iym1.a, 0L));
        if (cvn.a)
        {
            iym1 = String.valueOf(iym1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iym1).length() + 23)).append("SetTypingResponse from:").append(iym1).toString());
        }
    }

    public static cvn parseFrom(iym iym1)
    {
        if (a(iym1.responseHeader))
        {
            return new cvz(iym1.responseHeader);
        } else
        {
            return new cyh(iym1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((iym)kop.mergeFrom(new iym(), abyte0));
    }
}
