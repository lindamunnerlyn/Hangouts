// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hba extends Enum
{

    public static final hba a;
    public static final hba b;
    public static final hba c;
    public static final hba d;
    private static final hba e[];

    private hba(String s, int i)
    {
        super(s, i);
    }

    public static hba valueOf(String s)
    {
        return (hba)Enum.valueOf(hba, s);
    }

    public static hba[] values()
    {
        return (hba[])e.clone();
    }

    static 
    {
        a = new hba("STANDARD", 0);
        b = new hba("FULL", 1);
        c = new hba("USE_MANUAL_UPLOAD_SERVER_SETTING", 2);
        d = new hba("NO_POLICY", 3);
        e = (new hba[] {
            a, b, c, d
        });
    }
}
