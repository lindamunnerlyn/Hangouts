// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public final class foe
    implements android.os.Parcelable.Creator
{

    public foe()
    {
    }

    public static MarkerOptions a(Parcel parcel)
    {
        int j = g.a(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)g.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    s = g.i(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = g.j(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = g.g(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = g.g(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = g.c(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = g.c(parcel, k);
                    break;

                case 10: // '\n'
                    flag = g.c(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = g.g(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = g.g(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = g.g(parcel, k);
                    break;

                case 14: // '\016'
                    f = g.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new MarkerOptions[i];
    }
}
