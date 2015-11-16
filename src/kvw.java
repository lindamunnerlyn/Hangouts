// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kvw extends IllegalArgumentException
{

    public kvw(int i, int j)
    {
        super((new StringBuilder(54)).append("Unpaired surrogate at index ").append(i).append(" of ").append(j).toString());
    }
}
