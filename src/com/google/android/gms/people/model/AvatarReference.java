// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eof;
import fqw;
import g;
import h;

public final class AvatarReference
    implements SafeParcelable
{

    public static final fqw CREATOR = new fqw();
    final int a;
    final String b;
    private final int c;

    public AvatarReference(int i, int j, String s)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.a(flag);
        c = i;
        a = j;
        b = s;
    }

    public int a()
    {
        return c;
    }

    public int b()
    {
        return a;
    }

    public String c()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return g.c(this).a("source", Integer.valueOf(a)).a("location", b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fqw.a(this, parcel);
    }

}
