// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import ftz;
import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CheckServerAuthResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ftz();
    final int a;
    final boolean b;
    final List c;

    public CheckServerAuthResult(int i, boolean flag, List list)
    {
        a = i;
        b = flag;
        c = list;
    }

    public CheckServerAuthResult(boolean flag, Set set)
    {
        if (set == null)
        {
            set = Collections.emptyList();
        } else
        {
            set = Collections.unmodifiableList(new ArrayList(set));
        }
        this(1, flag, ((List) (set)));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = g.p(parcel, 20293);
        g.b(parcel, 1, a);
        g.a(parcel, 2, b);
        g.c(parcel, 3, c);
        g.q(parcel, i);
    }

}
