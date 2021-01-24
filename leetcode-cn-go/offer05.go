// func replaceSpace(s string) string {
//
//     var sb  strings.Builder
//     sb.Grow(len(s))
//     for i := 0; i < len(s); i++ {
//         b := s[i]
//         if b == ' ' {
//             sb.WriteString("%20")
//         } else {
//             sb.WriteByte(b)
//         }
//     }
//     return sb.String()
// }

func replaceSpace(s string) string {
    count := 0
    for i := 0; i < len(s); i++ {
        if s[i] == ' ' {
            count++
        }
    }
    size := len(s) + count * 2
    bytes := make([]byte, size)

    j := 0
    for i := 0; i < len(s); i++ {
        if s[i] == ' ' {
            bytes[j], bytes[j+1], bytes[j+2] = '%', '2','0'
            j = j + 3
        } else {
            bytes[j] = s[i]
            j = j + 1
        }
    }
    return string(bytes)
}
