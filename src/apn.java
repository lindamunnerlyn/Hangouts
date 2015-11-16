// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class apn
    implements apl
{

    private final apk a;

    protected apn(apk apk)
    {
        a = apk;
    }

    abstract boolean a(ani ani);

    public boolean a(ani ani, apk apk)
    {
        if (a == apk)
        {
            return a(ani);
        } else
        {
            return false;
        }
    }
}
