// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

final class cml extends cmu
{

    final cls a;

    cml(cls cls1, String s)
    {
        a = cls1;
        super(s);
    }

    public void a()
    {
        Intent intent = new Intent(a.a, com/google/android/apps/hangouts/realtimechat/DebugOzGetMergedPersonActivity);
        intent.putExtra("account_id", a.c);
        a.a.startActivity(intent);
    }
}
