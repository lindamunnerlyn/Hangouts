// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;

final class fmo extends ejt
{

    fmo()
    {
    }

    public ejv a(Context context, Looper looper, emo emo, Object obj, eka eka, ekc ekc)
    {
        obj = (fmp)obj;
        h.a(obj, "Must provide valid PeopleOptions!");
        return new fpo(context, looper, eka, ekc, String.valueOf(((fmp) (obj)).a), emo);
    }
}
