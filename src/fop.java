// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;

public final class fop
    implements android.os.Parcelable.Creator
{

    public fop()
    {
    }

    public static GoogleMapOptions a(Parcel parcel)
    {
        int k = g.a(parcel);
        int j = 0;
        byte byte9 = -1;
        byte byte8 = -1;
        int i = 0;
        CameraPosition cameraposition = null;
        byte byte7 = -1;
        byte byte6 = -1;
        byte byte5 = -1;
        byte byte4 = -1;
        byte byte3 = -1;
        byte byte2 = -1;
        byte byte1 = -1;
        byte byte0 = -1;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 13: // '\r'
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    byte9 = g.d(parcel, l);
                    break;

                case 3: // '\003'
                    byte8 = g.d(parcel, l);
                    break;

                case 4: // '\004'
                    i = g.e(parcel, l);
                    break;

                case 5: // '\005'
                    cameraposition = (CameraPosition)g.a(parcel, l, CameraPosition.CREATOR);
                    break;

                case 6: // '\006'
                    byte7 = g.d(parcel, l);
                    break;

                case 7: // '\007'
                    byte6 = g.d(parcel, l);
                    break;

                case 8: // '\b'
                    byte5 = g.d(parcel, l);
                    break;

                case 9: // '\t'
                    byte4 = g.d(parcel, l);
                    break;

                case 10: // '\n'
                    byte3 = g.d(parcel, l);
                    break;

                case 11: // '\013'
                    byte2 = g.d(parcel, l);
                    break;

                case 12: // '\f'
                    byte1 = g.d(parcel, l);
                    break;

                case 14: // '\016'
                    byte0 = g.d(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GoogleMapOptions(j, byte9, byte8, i, cameraposition, byte7, byte6, byte5, byte4, byte3, byte2, byte1, byte0);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new GoogleMapOptions[i];
    }
}
