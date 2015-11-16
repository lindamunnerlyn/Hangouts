// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class gao extends Exception
{

    private final Intent a;

    public gao(String s, Intent intent, Throwable throwable)
    {
        super(s, throwable);
        a = intent;
    }
}
