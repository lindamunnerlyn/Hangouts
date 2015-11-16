// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.hangouts.peoplelistv2.impl.PeopleSearchActivity;

final class cfp extends cbh
{

    public cfp()
    {
    }

    public int a()
    {
        return h.iJ;
    }

    public void a(Activity activity)
    {
        g.a(a, 2546);
        Intent intent = new Intent(activity, com/google/android/apps/hangouts/peoplelistv2/impl/PeopleSearchActivity);
        intent.putExtra("account_id", a.h());
        activity.startActivity(intent);
    }

    public int b()
    {
        return n.j;
    }

    public int c()
    {
        return 3;
    }

    public int d()
    {
        return 1;
    }

    public int e()
    {
        return 3;
    }
}
