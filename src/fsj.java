// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executors;

final class fsj extends ejt
{

    fsj()
    {
    }

    public ejv a(Context context, Looper looper, emo emo, Object obj, eka eka, ekc ekc)
    {
        obj = fro.a;
        return new fsc(context, looper, false, emo, eka, ekc, Executors.newSingleThreadExecutor());
    }
}
