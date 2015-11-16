// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;

public final class frb
    implements android.os.Parcelable.Creator
{

    public frb()
    {
    }

    public static ParcelableListOptions a(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        boolean flag = false;
        int j = g.a(parcel);
        String s = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag2 = g.c(parcel, k);
                    break;

                case 1000: 
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = g.c(parcel, k);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    flag = g.c(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = g.k(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableListOptions(i, flag2, flag1, flag, s, bundle);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new ParcelableListOptions[i];
    }
}
