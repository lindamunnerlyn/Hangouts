// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;

class ej
{

    ej()
    {
    }

    public Intent a(ComponentName componentname)
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(componentname);
        intent.addCategory("android.intent.category.LAUNCHER");
        return intent;
    }
}
