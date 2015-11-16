// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

public final class ezv
    implements android.view.View.OnClickListener
{

    final Context a;
    final int b;

    public ezv(Context context, int i)
    {
        a = context;
        b = i;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(ejn.a(b));
    }
}
