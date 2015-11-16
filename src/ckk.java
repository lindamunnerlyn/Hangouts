// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class ckk
    implements dvo
{

    final BabelHomeActivity a;

    public ckk(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void a()
    {
        if (BabelHomeActivity.b(a) != null)
        {
            BabelHomeActivity.b(a).a(0.0F, BabelHomeActivity.a(a));
        }
    }

    public void a(Snackbar snackbar)
    {
        BabelHomeActivity.b(a).a(snackbar.getMeasuredHeight(), BabelHomeActivity.a(a));
    }
}
