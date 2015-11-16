// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

final class fsi extends ejt
{

    fsi()
    {
    }

    public ejv a(Context context, Looper looper, emo emo, Object obj, eka eka, ekc ekc)
    {
        return new fsc(context, looper, true, emo, eka, ekc, Executors.newSingleThreadExecutor());
    }

    public List a()
    {
        return Arrays.asList(new Scope[] {
            fsh.e, fsh.f
        });
    }
}
