// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.Arrays;

public final class cmn
    implements android.view.View.OnLongClickListener
{

    final String a[];
    final DebugActivity b;

    public cmn(DebugActivity debugactivity, String as[])
    {
        b = debugactivity;
        a = as;
        super();
    }

    public boolean onLongClick(View view)
    {
        return DebugActivity.a(b, Arrays.toString(a));
    }
}
