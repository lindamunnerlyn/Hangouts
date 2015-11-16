// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

public final class fpm
    implements android.os.Parcelable.Creator
{

    public fpm()
    {
    }

    public static ParcelableLoadImageOptions a(Parcel parcel)
    {
        boolean flag = false;
        int l = g.a(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, i1);
                    break;

                case 1000: 
                    i = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    k = g.e(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = g.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParcelableLoadImageOptions(i, j, k, flag);
            }
        } while (true);
    }

    public static void a(ParcelableLoadImageOptions parcelableloadimageoptions, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, parcelableloadimageoptions.b());
        g.b(parcel, 1000, parcelableloadimageoptions.a());
        g.b(parcel, 2, parcelableloadimageoptions.c());
        g.a(parcel, 3, parcelableloadimageoptions.d());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new ParcelableLoadImageOptions[i];
    }
}
