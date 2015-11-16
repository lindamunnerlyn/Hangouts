// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wearable.internal.MessageEventParcelable;

final class fvy
    implements Runnable
{

    final MessageEventParcelable a;
    final fvw b;

    fvy(fvw fvw1, MessageEventParcelable messageeventparcelable)
    {
        b = fvw1;
        a = messageeventparcelable;
        super();
    }

    public void run()
    {
        b.b.a(a);
    }
}
