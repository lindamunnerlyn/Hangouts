// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class daf extends cxr
{

    private static final long serialVersionUID = 1L;

    private daf(jem jem1)
    {
        super(jem1.responseHeader, 0L);
        if (cxr.a)
        {
            jem1 = String.valueOf(jem1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jem1).length() + 28)).append("SetDndPresenceResponse from:").append(jem1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jem)kws.mergeFrom(new jem(), abyte0);
        if (a(((jem) (abyte0)).responseHeader))
        {
            return new cyd(((jem) (abyte0)).responseHeader);
        } else
        {
            return new daf(abyte0);
        }
    }
}
