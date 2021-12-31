package me.richardpanman.pluginplay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An abstract base class describing access to an external system.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class ExternalSystemInterface {
    private String testString;
}
